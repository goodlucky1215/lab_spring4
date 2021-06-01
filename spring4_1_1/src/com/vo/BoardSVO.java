package com.vo;

public class BoardSVO {
	private int bm_no = 0;
	private int bm_seq = 0;
	private String bm_file = "";
	private double bm_size = 0.0;
	private BoardMVO bmVO = null; //여러 VO를 사용할 때, 이렇게 클래스를 넣어서도 사용이 가능하나 되도록이면 맵으로 그냥 묶어 쓰기. 
	public int getBm_no() {
		return bm_no;
	}

	public void setBm_no(int bm_no) {
		this.bm_no = bm_no;
	}

	public int getBm_seq() {
		return bm_seq;
	}

	public void setBm_seq(int bm_seq) {
		this.bm_seq = bm_seq;
	}

	public String getBm_file() {
		return bm_file;
	}

	public void setBm_file(String bm_file) {
		this.bm_file = bm_file;
	}

	public double getBm_size() {
		return bm_size;
	}

	public void setBm_size(double bm_size) {
		this.bm_size = bm_size;
	}
}
