package mvcboard.model.dto;

public class BoardDTO {
	
	private int idx;//일련번호
	private String name ;//작성자 이름
	private String	title;//글 제목
	private String	content;//글 내용
	private String	postdate;//작성일 
	private String	ofile;//원본파일
	private String	sfile ;//저장된 파일명
	private int	downcount;//다운로드 횟수
	private String	passwd;//비밀번호
	private int	visitcount;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getOfile() {
		return ofile;
	}
	public void setOfile(String ofile) {
		this.ofile = ofile;
	}
	public String getSfile() {
		return sfile;
	}
	public void setSfile(String sfile) {
		this.sfile = sfile;
	}
	public int getDowncount() {
		return downcount;
	}
	public void setDowncount(int downcount) {
		this.downcount = downcount;
	}
	public String getPass() {
		return passwd;
	}
	public void setPass(String passwd) {
		this.passwd = passwd;
	}
	public int getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}
	@Override
	public String toString() {
		return "BoardDTO [idx=" + idx + ", name=" + name + ", title=" + title + ", content=" + content + ", postdate="
				+ postdate + ", ofile=" + ofile + ", sfile=" + sfile + ", downcount=" + downcount + ", passwd=" + passwd
				+ ", visitcount=" + visitcount + "]";
	}
	
	
	

}
