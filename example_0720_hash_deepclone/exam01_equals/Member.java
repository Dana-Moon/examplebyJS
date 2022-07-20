package example_0720_hash_deepclone.exam01_equals;

public class Member {
	public String id;

	//������(Ŭ������ ���� �ν��Ͻ��� ó�� ���� �� �����ϴ� ��)
	//String �Ű� ���� id�� �޾Ƽ� �ʵ尪 id�� �Ҵ�(����,����)
	public Member(String id) {
		this.id = id;
	}

	//�޼ҵ� : �� �ν��Ͻ��� ���� �ִ� ���!
	//Object�� �ִ� equals �޼ҵ带 ������!
	//�������̵� : ����� �޾Ƽ� ������ �ϴ� ��. Member�� ����� ���?
	//��� Ŭ������ Object��� Ŭ�������� ���۵Ǹ�, ��ӹ޽��ϴ�.
	//equals�� ������ �ؼ� ���ο� �񱳱����� ������ �����
	//@ : ������̼�. �Ʒ� �޼����� ������ JVM���� �������ִ� ����
	//Object�� �ֻ��� Ÿ���̹Ƿ� ��� ��ü�� Object Ÿ������ �ڵ� Ÿ�� ��ȯ�� �� ����.
	@Override
	public boolean equals(Object obj) {
		//������ ������ �ν��Ͻ��� Ÿ���� Member�̱� ������ if���� true�� ���.
		if(obj instanceof Member) {
			//Member Ÿ������ obj�� ����ȯ
			//member��� ���������� obj(�ּ�)�� ����. ������ ����� ���� �ƴϴ�.
			Member member = (Member) obj;
			//id = member�� �ʵ尪
			//id = String�̱� ������ ����Ÿ���̹Ƿ� equals�� ���� ��
			//�ν��Ͻ��� id��� �ʵ尪�� �Ű����� obj(member)�� id�� ��
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
