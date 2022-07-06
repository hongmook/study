package day11;

public class BoardControl {
     
   public static void main(String[] args) {
      BoardServiceImpl bs = new BoardServiceImpl();
      //new BoardControl().get(bs.listBoard());
      
      //keyword
      String keyword = "토요";
      String category = "title";
      Board[] rs = bs.listBoard(category,keyword);
      
      if(rs.length>0) {
    	  bs.printboard(rs);
      }else {
         System.out.println("게시물이 없습니다.");
      }
      
   }

}