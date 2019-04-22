import java.util.LinkedList;
import JSHOP2.*;

public class cwcproblem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[0];


		return problemConstants;
	}

	private static void createState0(State s)	{
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(13);

		Domain d = new cwcdomain();

		d.setProblemConstants(defineConstants());

		State s = new State(13, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(8, 0, new TermList(TermList.NIL, TermList.NIL)), false, false));

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