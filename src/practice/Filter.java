package practice;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public List filter_Duplicate_Entries(int kk[]) {

		List list = new ArrayList();

		for (int i = 0; i < kk.length; i++) {
			for (int j = 0; j < kk.length; j++) {

				if (kk[i] == kk[j]) {
					if (!list.contains(kk[j]))
						list.add(kk[j]);
				}

			}
		}

		return list;

	}

	public static void main(String[] args)

	{

		int kk[] = { 7, 2, 3, 4, 4, 5, 6, 5, 7, 7, 12, 1, 3, 3, 3, 5, 8, 10 };
		List list = new ArrayList();
		list = new Filter().filter_Duplicate_Entries(kk);
		list.sort(null);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
	
	
	}


