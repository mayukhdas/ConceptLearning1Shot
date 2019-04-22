import java.util.LinkedList;
import JSHOP2.*;

public class cwcproblem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[14];

		problemConstants[0] = "b1";
		problemConstants[1] = "b2";
		problemConstants[2] = "b3";
		problemConstants[3] = "b4";
		problemConstants[4] = "b5";
		problemConstants[5] = "b6";
		problemConstants[6] = "b7";
		problemConstants[7] = "b8";
		problemConstants[8] = "b9";
		problemConstants[9] = "b10";
		problemConstants[10] = "b11";
		problemConstants[11] = "b12";
		problemConstants[12] = "b13";
		problemConstants[13] = "b14";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(13), new TermList(new TermNumber(100.0), new TermList(new TermNumber(101.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(14), new TermList(new TermNumber(100.0), new TermList(new TermNumber(102.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(15), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(15), new TermList(new TermNumber(100.0), new TermList(new TermNumber(103.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(15), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(15), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(16), new TermList(new TermNumber(100.0), new TermList(new TermNumber(104.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(17), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(17), new TermList(new TermNumber(100.0), new TermList(new TermNumber(105.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(17), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(17), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(18), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(18), new TermList(new TermNumber(100.0), new TermList(new TermNumber(106.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(18), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(18), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(19), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(19), new TermList(new TermNumber(100.0), new TermList(new TermNumber(107.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(19), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(19), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(20), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(20), new TermList(new TermNumber(100.0), new TermList(new TermNumber(108.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(20), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(20), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(21), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(21), new TermList(new TermNumber(100.0), new TermList(new TermNumber(109.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(21), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(21), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(22), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(22), new TermList(new TermNumber(100.0), new TermList(new TermNumber(110.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(22), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(22), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(23), new TermList(new TermNumber(100.0), new TermList(new TermNumber(111.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(24), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(24), new TermList(new TermNumber(100.0), new TermList(new TermNumber(112.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(24), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(24), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(25), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(25), new TermList(new TermNumber(100.0), new TermList(new TermNumber(113.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(25), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(25), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(26), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(26), new TermList(new TermNumber(100.0), new TermList(new TermNumber(114.0), new TermList(new TermNumber(100.0), TermList.NIL))))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(26), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(26), TermList.NIL)));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(27);

		Domain d = new cwcdomain();

		d.setProblemConstants(defineConstants());

		State s = new State(13, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(8, 0, new TermList(new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(13), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(13), new TermList(new TermNumber(2.0), new TermList(new TermNumber(3.0), new TermList(new TermNumber(1.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(14), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(14), new TermList(new TermNumber(2.0), new TermList(new TermNumber(3.0), new TermList(new TermNumber(2.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(15), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(15), new TermList(new TermNumber(0.0), new TermList(new TermNumber(0.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(16), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(16), new TermList(new TermNumber(1.0), new TermList(new TermNumber(0.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(17), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(17), new TermList(new TermNumber(2.0), new TermList(new TermNumber(0.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(18), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(18), new TermList(new TermNumber(0.0), new TermList(new TermNumber(1.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(19), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(19), new TermList(new TermNumber(1.0), new TermList(new TermNumber(1.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(20), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(20), new TermList(new TermNumber(2.0), new TermList(new TermNumber(1.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(21), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(21), new TermList(new TermNumber(0.0), new TermList(new TermNumber(2.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(22), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(22), new TermList(new TermNumber(1.0), new TermList(new TermNumber(2.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(23), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(23), new TermList(new TermNumber(2.0), new TermList(new TermNumber(2.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(24), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(24), new TermList(new TermNumber(0.0), new TermList(new TermNumber(3.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(25), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(25), new TermList(new TermNumber(1.0), new TermList(new TermNumber(3.0), new TermList(new TermNumber(0.0), TermList.NIL))))), new TermList(new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(26), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermConstant.getConstant(26), new TermList(new TermNumber(2.0), new TermList(new TermNumber(3.0), new TermList(new TermNumber(0.0), TermList.NIL))))), TermList.NIL)))))))))))))))))))))))))))), TermList.NIL)), false, false));

		thread = new SolverThread(tl, 1);
		thread.start();

		try {
			while (thread.isAlive())
				Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		returnedPlans.addAll( thread.getPlans() );

		return returnedPlans;
	}

	public static LinkedList<Predicate> getFirstPlanOps() {
		return getPlans().getFirst().getOps();
	}
}