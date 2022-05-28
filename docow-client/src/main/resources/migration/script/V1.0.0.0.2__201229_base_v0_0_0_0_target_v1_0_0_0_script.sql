  -- /*创建库存备份的存储过程*/
-- CREATE PROCEDURE inventory_backup()
-- BEGIN
--     DECLARE flag_date date;
--     DECLARE start_temp datetime(3);
--     DECLARE end_temp datetime(3);
--     SELECT DATE(DATE_SUB(NOW(), INTERVAL 90 DAY)) INTO flag_date;
-- /*获取备份前时间*/
--     SELECT NOW(3) INTO start_temp;
-- /*删除90天之前的备份数据*/
--     DELETE FROM merp_wms_cell_inventory_daily WHERE backup_date <= flag_date;
-- /*备份前一天的数据*/
--     INSERT INTO merp_wms_cell_inventory_daily(warehouse_area_id, backup_date, warehouse_cell_id, warehouse_cell_type, sku_id, sku_info,
--     total_count, warehouse_id,note, record_date, created_at, created_by, updated_at, updated_by)
--     SELECT  warehouse_area_id, CURDATE() AS backup_date, warehouse_cell_id, warehouse_cell_type, sku_id,
--     sku_info, total_count, warehouse_id, note, record_date, created_at, created_by, updated_at, updated_by FROM merp_wms_cell_inventory;
-- /*获取备份后时间*/
--     SELECT NOW(3) INTO end_temp;
-- /*业务记录表记录下操作*/
--     INSERT INTO merp_wms.merp_business_record(start_time, end_time, record_date, `type`) VALUES (start_temp, end_temp, CURDATE(), 'backup_store');
-- END;
--
-- /*创建定时任务*/
-- CREATE EVENT IF NOT EXISTS inventory_inventory_event
-- /*每天凌晨0点触发*/
--     ON SCHEDULE EVERY 1 DAY STARTS DATE_ADD(DATE_ADD(CURDATE(), INTERVAL 1 DAY), INTERVAL 0 HOUR)
--     ON COMPLETION PRESERVE ENABLE
-- /*调用库存备份的存储过程*/
--     DO CALL inventory_backup();
