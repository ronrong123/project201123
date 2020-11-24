package com.yedam.interfaces;

public class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MysqlDB에서 검색.");
	}

	@Override
	public void insert() {
		System.out.println("MysqlDB에서 입력.");
	}

	@Override
	public void update() {
		System.out.println("MysqlDB를 변경");
	}

	@Override
	public void delete() {
		System.out.println("MysqlDB에서 삭제.");
	}

}
