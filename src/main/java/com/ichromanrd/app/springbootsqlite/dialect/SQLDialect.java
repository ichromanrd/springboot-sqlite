package com.ichromanrd.app.springbootsqlite.dialect;

import java.sql.Types;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.identity.IdentityColumnSupport;

public class SQLDialect extends Dialect {

	public SQLDialect() {
		registerColumnType(Types.BIT, "integer");
		registerColumnType(Types.TINYINT, "tinyint");
		registerColumnType(Types.SMALLINT, "smallint");
		registerColumnType(Types.INTEGER, "integer");
		registerColumnType(Types.VARCHAR, "varchar");
		
	}
	
	@Override
	public IdentityColumnSupport getIdentityColumnSupport() {
		return new SQLiteIdentityColumnSupport();
	}
	
	@Override
	public boolean hasAlterTable() {
		return false;
	}
	
	@Override
	public boolean dropConstraints() {
		return false;
	}
	
	@Override
	public String getDropForeignKeyString() {
		return "";
	}
	
	@Override
	public String getAddForeignKeyConstraintString(String constraintName, String foreignKeyDefinition) {
		return "";
	}
	
	@Override
	public String getAddPrimaryKeyConstraintString(String constraintName) {
		return "";
	}
	
	@Override
	public String getAddColumnString() {
	    return "add column";
	}
}
