public class Switch1{
	public static void main(String[] args){
		//声明变量score，并赋值为‘C’
		char score='A';
		//执行switch分支语句
		switch(score){
			case 'A':
			System.out.println("优秀");
			case 'B':
			System.out.println("良好");
			case 'C':
			System.out.println("中");
			break;
			case 'F':
			System.out.println("不及格");
			break;
			default:
			System.out.println("成绩输入错误");
		}
	}
}