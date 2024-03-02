/*
 * This file is generated by jOOQ.
 */
package net.forgecraft.services.ember.db.schema.tables.records;


import java.time.LocalDateTime;

import net.forgecraft.services.ember.db.schema.tables.ModFiles;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ModFilesRecord extends UpdatableRecordImpl<ModFilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mod_files.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mod_files.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mod_files.mod_id</code>.
     */
    public void setModId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mod_files.mod_id</code>.
     */
    public String getModId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mod_files.uploader_id</code>.
     */
    public void setUploaderId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>mod_files.uploader_id</code>.
     */
    public Long getUploaderId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>mod_files.mod_version</code>.
     */
    public void setModVersion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mod_files.mod_version</code>.
     */
    public String getModVersion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mod_files.active</code>.
     */
    public void setActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>mod_files.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>mod_files.file_name</code>.
     */
    public void setFileName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mod_files.file_name</code>.
     */
    public String getFileName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mod_files.file_path</code>.
     */
    public void setFilePath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mod_files.file_path</code>.
     */
    public String getFilePath() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mod_files.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>mod_files.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ModFilesRecord
     */
    public ModFilesRecord() {
        super(ModFiles.MOD_FILES);
    }

    /**
     * Create a detached, initialised ModFilesRecord
     */
    public ModFilesRecord(Integer id, String modId, Long uploaderId, String modVersion, Boolean active, String fileName, String filePath, LocalDateTime createdAt) {
        super(ModFiles.MOD_FILES);

        setId(id);
        setModId(modId);
        setUploaderId(uploaderId);
        setModVersion(modVersion);
        setActive(active);
        setFileName(fileName);
        setFilePath(filePath);
        setCreatedAt(createdAt);
        resetChangedOnNotNull();
    }
}
