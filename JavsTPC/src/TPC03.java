import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// ���踦 �����϶�. PDT vs UDDT
		// �⺻�ڷ��� (PDT) , ����������ڷ���(UDDT)
		// ���� 1���� �����ϱ����� ������ �����Ͻÿ�.
		
		int a;
		a=10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		// å���� ����, ����, ���ǻ�, ��������, ISBN �� ���������� �ְ� �����ؾ��Ѵ�.
		// �������� �и��ؼ� ������Ѿ� �Ѵ�. ���������� ó���Ҽ����� ��� �ϳ��� ���·� Book�� ������ �Ѵ�.
		// ���踦 ������ϴµ� �װ� class��� �Ѵ�.
		// kr.bit ��Ű������ Book�̶�� ����(Ŭ����)�� �������� �Ѵ�. (��������� �ڷ���)
		// V(Variable) : ����, �޼���
		// D(DataType) : PDT, UDDT, array, class
		// A(Assign)   : ����, �Ҵ�
		
		Book b;
		// b�� �����ε� ������ ������ 1���� ������ �� �� �ִ°Ŵ�. �׷� Book���� ����, ����... �̷��͵��� ��������? ��ü�� ����!
		b = new Book(); // ��ü�� �����ϴ�.
		b.title="�ڹ�";
		b.price=15000;
		b.company="�Ѻ��̵��";
		b.page=700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		
		PersonVO p;
		p = new PersonVO();
		p.name = "�ڸ���";
		p.age = 40;
		p.weight = 68.4f;
		p.height = 175.7f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.height + "\t");
		
		
	}

}