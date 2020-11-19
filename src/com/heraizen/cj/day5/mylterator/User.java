package com.heraizen.cj.day5.mylterator;
class User{
	private String name[] = null;
	
	User(String arr[])
	{
		this.name = arr;
	}
	public Mylterator getIterator() {
		// TODO Auto-generated method stub
		return new UserList();
	}


class UserList implements Mylterator {
	
	int i=0;
	public boolean hasNext()
	{
		if(i!= name.length)
		{
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String next() {

		String str = name[i];
		i++;
		return str;
	}
	public void view()
	{
		for(String arr : name)
		{
			System.out.println(arr);
		}
	}
	
}




}