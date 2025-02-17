package com.my.Lab5.db;

import java.sql.Connection;

public abstract class DAO<T extends DataTransferObject> {
    protected final Connection dataDomainConnection;

    public DAO(Connection dataDomainConnection) {
        this.dataDomainConnection = dataDomainConnection;
    }

    public abstract void create(T dto);
}