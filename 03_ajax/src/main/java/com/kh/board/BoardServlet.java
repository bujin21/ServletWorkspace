package com.kh.board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.action.model.vo.Board;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Board> list = new ArrayList<>();
		list.add(new Board(1,"kh게시판 1번글", "admin", "2024-06-05"));
		list.add(new Board(2,"kh게시판 2번글", "admin", "2024-06-05"));
		list.add(new Board(3,"kh게시판 3번글", "mkm", "2024-06-05"));
		list.add(new Board(4,"kh게시판 4번글", "user01", "2024-06-05"));
		list.add(new Board(5,"kh게시판 5번글", "user02", "2024-06-05"));
		
		request.setAttribute("list", list);
		request
			.getRequestDispatcher("/board/list.jsp")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
