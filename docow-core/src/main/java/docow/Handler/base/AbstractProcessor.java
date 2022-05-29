package docow.Handler.base;

public abstract class AbstractProcessor<T> implements Proccess<T>{

    @Override
    public void execute(T context) {
        if(onCondition(context)){
            doExecute(context);
        }
    }

    protected  boolean onCondition(T context){return  true;};

    protected  abstract  void  doExecute(T context);
}
