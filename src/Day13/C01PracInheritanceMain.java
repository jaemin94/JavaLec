package Day13;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//출력 결과
//32인치 1024컬러
class TV{
	   private int size;
	   public TV(int size) 
	   { 
		   this.size = size; 
		}
	   protected int getSize() 
	   { 
		   return size; 
	   }
	}

class ColorTv extends TV
{
	int color;
	
	public ColorTv(int size, int color) 
	   { 
		   super(size);
		   this.color = color;
		}
	

	public void printProperty() {
		System.out.println(this.getSize() + "인치 " + color + "컬러");
	}
}

public class C01PracInheritanceMain {

	public static void main(String[] args) {
		
		ColorTv myTV = new ColorTv(32, 1024);
		   myTV.printProperty(); // 32인치 1024컬러 가 나오면 해결!

	}

}
