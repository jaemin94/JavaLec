package Day19;

import java.util.HashSet;
import java.util.Set;

public class C02PracSetMain {

	public static void main(String[] args) {
		
		
		// 1 ~ 45 까지 숫자를 6개을 랜덤으로 받아 set에 저장
		// [추가] 저장된 set의 오름차순정렬을 해보세요
		Set<Integer> numberSet = new HashSet<>();

		while (numberSet.size() < 6) {
		    int randomNum = (int)(Math.random() * 45) + 1;
		    numberSet.add(randomNum);
		}

		int bonusNum;
		do {
		    bonusNum = (int)(Math.random() * 45) + 1;
		} while (numberSet.contains(bonusNum));

		int[] numbers = new int[6];
		int index = 0;
		for (int num : numberSet) {
		    numbers[index++] = num;
		    System.out.println(num);
		}

	}

}

/*
  	Set<Integer> set = new HashSet();
	Random rnd = new Random();
	while(true)
	{
		if(set.size()==6)
			{
				break;
			}
		System.out.println(rnd.nextInt(45)+1);
		set.add(rnd.nextInt(45)+1);
		
	}

	// set -> list
	List<Integer> list = new ArrayList(set);
	Collections.sort(list); // 오름차순
	Collections.sort(list,Collections.reverseOrder()); // 내림차순
	for(Integer el : list
		System.out.println(el + " ");


	// Stream 함수
	List<Integer> list = set.stream().sorted().collect(collectors.toList());
	
	for(Integer el : list)
		System.out.println(el);




*/
