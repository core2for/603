package comone.forJinjie;
/**
*这是针对数组进行操作的工具类
*@author hfc
*@version V.10
*/
public class ArrayTool {
	//把构造方法私有化，外界就不能再创建对象了
	private ArrayTool() {}
    /**
	*这是遍历数组的方法，便利后的格式是：[元素1， 元素2....]
 	*@param arr 这是要被遍历的数组
    */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
	/**
	*这是取得数组中最大值的方法
	*@param arr 这是要被遍历的数组
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	//获取指定值的下标
	public static int getIndex(int[] arr) {

		return 0;
	}
}