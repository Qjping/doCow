package config;//package cow.config;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

@WebFilter(urlPatterns = {
        "/merp-api/wms/outbound-apply/search",

}, filterName = "snakeCaseQueryStringFilter")
public class SnakeCaseQueryStringConvertFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(new SnakeCaseQueryStringRequestWrapper((HttpServletRequest) servletRequest),
                servletResponse);
    }

    public class SnakeCaseQueryStringRequestWrapper extends HttpServletRequestWrapper {
        private final Enumeration<String> parameterNames;
        private final Map<String, String[]> parameterValues = new HashMap<>();

        public SnakeCaseQueryStringRequestWrapper(HttpServletRequest request) {
            super(request);
            Enumeration<String> parameterNames = super.getParameterNames();
            Vector<String> names = new Vector<>();
            while (parameterNames != null && parameterNames.hasMoreElements()) {
                String name = parameterNames.nextElement();
                String[] values = super.getParameterValues(name);
                String convertName = this.convertName(name);
                names.add(convertName);
                parameterValues.put(convertName, values);
            }
            this.parameterNames = names.elements();
        }

        private String convertName(String snakeCaseName) {
            if (!snakeCaseName.contains("_")) {
                return snakeCaseName;
            }
            StringBuilder stringBuilder = new StringBuilder();
            String[] name = snakeCaseName.split("_");
            for (int i = 0; i < name.length; i++) {
                String s = name[i];
                if (i != 0) {
                    s = toUpperFirstChar(s);
                }
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        }

        private String toUpperFirstChar(String string) {
            char[] charArray = string.toCharArray();
            charArray[0] -= 32;
            return String.valueOf(charArray);
        }

        @Override
        public Enumeration<String> getParameterNames() {
            return this.parameterNames;
        }

        @Override
        public String[] getParameterValues(String name) {
            return this.parameterValues.get(name);
        }
    }
}
