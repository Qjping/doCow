/*
 * This file is generated by jOOQ.
 */
package docow.jooq.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import docow.jooq.tables.CaseConfig;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CaseConfigRecord extends UpdatableRecordImpl<CaseConfigRecord> implements Record9<Integer, String, String, Integer, LocalDate, LocalDateTime, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>docow.case_config.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>docow.case_config.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>docow.case_config.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>docow.case_config.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>docow.case_config.headers</code>.
     */
    public void setHeaders(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>docow.case_config.headers</code>.
     */
    public String getHeaders() {
        return (String) get(2);
    }

    /**
     * Setter for <code>docow.case_config.delete_flag</code>. 删除标志, 1未删除 0已删除
     */
    public void setDeleteFlag(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>docow.case_config.delete_flag</code>. 删除标志, 1未删除 0已删除
     */
    public Integer getDeleteFlag() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>docow.case_config.record_date</code>. 创建日期
     */
    public void setRecordDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>docow.case_config.record_date</code>. 创建日期
     */
    public LocalDate getRecordDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>docow.case_config.created_at</code>. 创建时间
     */
    public void setCreatedAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>docow.case_config.created_at</code>. 创建时间
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>docow.case_config.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>docow.case_config.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>docow.case_config.updated_at</code>. 更新时间
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>docow.case_config.updated_at</code>. 更新时间
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>docow.case_config.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>docow.case_config.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, Integer, LocalDate, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, Integer, LocalDate, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CaseConfig.CASE_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return CaseConfig.CASE_CONFIG.URL;
    }

    @Override
    public Field<String> field3() {
        return CaseConfig.CASE_CONFIG.HEADERS;
    }

    @Override
    public Field<Integer> field4() {
        return CaseConfig.CASE_CONFIG.DELETE_FLAG;
    }

    @Override
    public Field<LocalDate> field5() {
        return CaseConfig.CASE_CONFIG.RECORD_DATE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return CaseConfig.CASE_CONFIG.CREATED_AT;
    }

    @Override
    public Field<String> field7() {
        return CaseConfig.CASE_CONFIG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return CaseConfig.CASE_CONFIG.UPDATED_AT;
    }

    @Override
    public Field<String> field9() {
        return CaseConfig.CASE_CONFIG.UPDATED_BY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUrl();
    }

    @Override
    public String component3() {
        return getHeaders();
    }

    @Override
    public Integer component4() {
        return getDeleteFlag();
    }

    @Override
    public LocalDate component5() {
        return getRecordDate();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public String component7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdatedAt();
    }

    @Override
    public String component9() {
        return getUpdatedBy();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUrl();
    }

    @Override
    public String value3() {
        return getHeaders();
    }

    @Override
    public Integer value4() {
        return getDeleteFlag();
    }

    @Override
    public LocalDate value5() {
        return getRecordDate();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public String value7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdatedAt();
    }

    @Override
    public String value9() {
        return getUpdatedBy();
    }

    @Override
    public CaseConfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CaseConfigRecord value2(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public CaseConfigRecord value3(String value) {
        setHeaders(value);
        return this;
    }

    @Override
    public CaseConfigRecord value4(Integer value) {
        setDeleteFlag(value);
        return this;
    }

    @Override
    public CaseConfigRecord value5(LocalDate value) {
        setRecordDate(value);
        return this;
    }

    @Override
    public CaseConfigRecord value6(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public CaseConfigRecord value7(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CaseConfigRecord value8(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public CaseConfigRecord value9(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public CaseConfigRecord values(Integer value1, String value2, String value3, Integer value4, LocalDate value5, LocalDateTime value6, String value7, LocalDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CaseConfigRecord
     */
    public CaseConfigRecord() {
        super(CaseConfig.CASE_CONFIG);
    }

    /**
     * Create a detached, initialised CaseConfigRecord
     */
    public CaseConfigRecord(Integer id, String url, String headers, Integer deleteFlag, LocalDate recordDate, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(CaseConfig.CASE_CONFIG);

        setId(id);
        setUrl(url);
        setHeaders(headers);
        setDeleteFlag(deleteFlag);
        setRecordDate(recordDate);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }
}
