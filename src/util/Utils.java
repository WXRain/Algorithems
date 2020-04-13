/**
 * 
 */
package util;

import java.util.List;

/**
 * @author wangxinyu
 *
 */
public class Utils {
	/**
	 * TODO 打印一元List数组
	 * @param list
	 */
	public static void printList(List<Integer> list){
		if(list == null || list.size() == 0) {
			System.out.print("[]");
			return;
		}
		System.out.print("[");
		System.out.print(list.get(0));
		for(int i = 1; i < list.size(); i++){
			System.out.print("," + list.get(i));
		}
		System.out.print("]");
	}
	/**
	 * TODO 打印二元List数组
	 * @param list
	 */
	public static void printLists(List<List<Integer>> list){
		if(list == null || list.size() == 0) {
			System.out.print("[[]]");
			return;
		}
		System.out.print("[");
		printList(list.get(0));
		for(int i = 1; i < list.size(); i++){
			System.out.print(",");
			printList(list.get(i));
		}
		System.out.print("]");
	}
	/**
	 * TODO 将String转换成int数组，格式必须是[1,2,……]
	 * @param s
	 * @return
	 */
	public static int[] string2intarray(String s){
		s = s.replaceAll(" ", "");
		s = s.replaceAll("\\[", "");
		s = s.replaceAll("\\]", "");
		String[] ss = s.split(",");
		int[] result = new int[ss.length];
		for(int i = 0; i < ss.length; i++){
			result[i] = Integer.parseInt(ss[i]);
		}
		return result;
	}
}
