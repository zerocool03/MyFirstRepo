import java.util.ArrayList;

public class Friend {

	String email;
	ArrayList<Friend> friends = new ArrayList<Friend>();

	public Friend(String email) {

		this.email = email;

	}

	public void addFriend(Friend friend) {
		this.friends.add(friend);
		friend.getFriends().add(this);
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<Friend> getFriends() {
		return friends;
	}

	public boolean isConnectedWith(Friend friend) {

		String friendToFind = friend.getEmail();
		boolean flag = false;
		for (Friend f : this.getFriends()) {
			if (f.getEmail().equals(friendToFind)) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			for (Friend f : this.getFriends()) {
				if (f.isConnectedWith(friend)) {
					flag = true;
					break;
				}
			}
		}

		if (flag)
			return true;
		return false;
	}

	public static void main(String... args) {
		Friend a = new Friend("A");
		Friend b = new Friend("B");
		Friend c = new Friend("C");
		
		Friend d = new Friend("D");
		Friend e = new Friend("E");
		Friend f = new Friend("F");
		
		

		a.addFriend(b);
		b.addFriend(c);
		c.addFriend(d);
		d.addFriend(e);
		e.addFriend(f);
		
		System.out.println(a.isConnectedWith(f));
	}

}
