/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.LoreLocationsRecord;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Tue4LoreLocations extends TableImpl<LoreLocationsRecord> {

    private static final long serialVersionUID = -1024889148;

    /**
     * The reference instance of <code>tue4_lore_locations</code>
     */
    public static final Tue4LoreLocations LORE_LOCATIONS = new Tue4LoreLocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreLocationsRecord> getRecordType() {
        return LoreLocationsRecord.class;
    }

    /**
     * The column <code>tue4_lore_locations.lloc_id</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_ID = createField("lloc_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this,
        "");

    /**
     * The column <code>tue4_lore_locations.lloc_star_id</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_STAR_ID = createField("lloc_star_id", org.jooq.impl.SQLDataType.CHAR(32)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_lpla_id</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_LPLA_ID = createField("lloc_lpla_id", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_hemisphere</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_HEMISPHERE = createField("lloc_hemisphere", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_class</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_CLASS = createField("lloc_class", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_league</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_LEAGUE = createField("lloc_league",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_name</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_NAME = createField("lloc_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_latitude</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_LATITUDE = createField("lloc_latitude", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.lloc_longitude</code>.
     */
    public final TableField<LoreLocationsRecord, String> LLOC_LONGITUDE = createField("lloc_longitude", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_locations.created_at</code>.
     */
    public final TableField<LoreLocationsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP
        .nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>tue4_lore_locations.updated_at</code>.
     */
    public final TableField<LoreLocationsRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP
        .nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tue4_lore_locations</code> table reference
     */
    public Tue4LoreLocations() {
        this(DSL.name("tue4_lore_locations"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_locations</code> table reference
     */
    public Tue4LoreLocations(String alias) {
        this(DSL.name(alias), LORE_LOCATIONS);
    }

    /**
     * Create an aliased <code>tue4_lore_locations</code> table reference
     */
    public Tue4LoreLocations(Name alias) {
        this(alias, LORE_LOCATIONS);
    }

    private Tue4LoreLocations(Name alias, Table<LoreLocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreLocations(Name alias, Table<LoreLocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LORE_LOCATIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreLocationsRecord> getPrimaryKey() {
        return Keys.LORE_LOCATIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreLocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreLocationsRecord>>asList(Keys.LORE_LOCATIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreLocations as(String alias) {
        return new Tue4LoreLocations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreLocations as(Name alias) {
        return new Tue4LoreLocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreLocations rename(String name) {
        return new Tue4LoreLocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreLocations rename(Name name) {
        return new Tue4LoreLocations(name, null);
    }
}