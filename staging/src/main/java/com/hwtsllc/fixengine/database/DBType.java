package com.hwtsllc.fixengine.database;

public enum DBType {
    HSQLDB("HSQLDB", "HSQLDB", "HSQLDB In Memory DB"),
    MARIADB("MARIADB", "MARIADB", "MARIADB is a replacement for MYSQL"),
//    MYSQL("MYSQL", "MYSQL", "MYSQL"),
    POSTGRESQL("POSTGRESQL", "POSTGRESQL", "POSTGRESQL database"),
    ;

    private final String id;
    private final String name;
    private final String description;

    DBType( final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @param args   not used yet
     */
    public static void main(String[] args) {
        System.out.println("DBType");
    }
}
