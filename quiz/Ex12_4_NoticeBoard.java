package kr.co.quiz;

public class Ex12_4_NoticeBoard implements Ex12_4_Board {
	String name, title, content, writer, indate;
	
	public Ex12_4_NoticeBoard() {
	}

	public Ex12_4_NoticeBoard(String setTitle, String setContent, String setWriter, String setIndate) {
		this.title = setTitle;
		this.content = setContent;
		this.writer = setWriter;
		this.indate = setIndate;

	}
	@Override
	public void insert() {
		if (writer.equals(WRITER)) {
			System.out.println("공지사항이 등록 되었습니다.");
			System.out.println(title);
			System.out.println(content);
			System.out.println(writer);
			System.out.println(indate);
			System.out.println();
		} else {
			System.out.println("일치하지 않음.");
		}
		return;

	}

	@Override
	public void edit() {
		if (writer.equals(WRITER)) {
			System.out.println("공지사항이 수정 되었습니다.");
			System.out.println(title);
			System.out.println(content);
			System.out.println(writer);
			System.out.println(indate);
			System.out.println();
		} else {
			System.out.println("일치하지 않음.");
		}
		return;
	}

	@Override
	public void delete() {
		if (writer.equals(WRITER)) {
			System.out.println("공지사항 게시판에 글이 삭제 되었습니다.");
		} else {
			System.out.println("일치하지 않음.");
		}
		return;

	}

}


