/*
 * This file is generated by jOOQ.
 */
package net.forgecraft.services.ember.db.schema.tables.records;


import java.time.LocalDateTime;

import net.forgecraft.services.ember.db.schema.tables.Mods;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ModsRecord extends UpdatableRecordImpl<ModsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mods.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mods.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mods.project_url</code>.
     */
    public void setProjectUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mods.project_url</code>.
     */
    public String getProjectUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mods.issues_url</code>.
     */
    public void setIssuesUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mods.issues_url</code>.
     */
    public String getIssuesUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mods.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>mods.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ModsRecord
     */
    public ModsRecord() {
        super(Mods.MODS);
    }

    /**
     * Create a detached, initialised ModsRecord
     */
    public ModsRecord(String id, String projectUrl, String issuesUrl, LocalDateTime createdAt) {
        super(Mods.MODS);

        setId(id);
        setProjectUrl(projectUrl);
        setIssuesUrl(issuesUrl);
        setCreatedAt(createdAt);
        resetChangedOnNotNull();
    }
}