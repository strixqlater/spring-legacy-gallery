package kr.daoko.web.model;

import java.time.LocalDateTime;

public class PostVO {
	private int post_id;
	private int board_id;
	private int category_id;
	private String title;
	private String content;
	private int view_cnt;
	private String reg_id;
	private LocalDateTime reg_dt;
	private LocalDateTime edit_dt;
	
	
	public int getPost_id() {
		return post_id;
	}
	
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	
	public int getBoard_id() {
		return board_id;
	}
	
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	
	public int getCategory_id() {
		return category_id;
	}
	
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getView_cnt() {
		return view_cnt;
	}
	
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	
	public String getReg_id() {
		return reg_id;
	}
	
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	
	public LocalDateTime getReg_dt() {
		return reg_dt;
	}
	
	public void setReg_dt(LocalDateTime reg_dt) {
		this.reg_dt = reg_dt;
	}
	
	public LocalDateTime getEdit_dt() {
		return edit_dt;
	}
	
	public void setEdit_dt(LocalDateTime edit_dt) {
		this.edit_dt = edit_dt;
	}
}