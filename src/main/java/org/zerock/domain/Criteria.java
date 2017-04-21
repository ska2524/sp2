package org.zerock.domain;

public class Criteria {//검색기준
	
	
	private int page;
	private int size;
	private String type;
	private String keyword;
	
	
	



	public Criteria(){
		this.page = 1;
		this.size = 10;
		 
		
	}
	
	public Criteria settingPage(int page){ //builder pattern을 쓰면 연결할 수 있고, 내가 고를수 있다.(자기자신을 다시 불러오는것)
		if(page<=0){
			this.page = 1;
		}
		return this;
	}
	
	public Criteria settingSize(int size){
		if(size <=0 || size <=5){
			this.size = 5;
		}
		return this;
	}
	
	public int getSkip(){
		return (this.page -1)*this.size;
	}
	
	public int getAmount(){
		return this.size;
	}


	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", size=" + size + ", type=" + type + ", keyword=" + keyword + "]";
	}
	
	/*public String getSql(){
		return "AND 1=1 AND 2=2 AND 3=3";
	}*/
	
	
	
	
	
	
}
