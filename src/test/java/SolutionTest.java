import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.example.Solution2;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution2 solution = new Solution2();

        // Test case 1
        String command1 = "G()(al)";
        String expected1 = "Goal";
        String actual1 = solution.interpret(command1);
        assertEquals(expected1, actual1);

        // Test case 2
        String command2 = "(al)G(al)()()G";
        String expected2 = "alGalooG";
        String actual2 = solution.interpret(command2);
        assertEquals(expected2, actual2);

        // Test case 3
        String command3 = "G()()()()(al)";
        String expected3 = "Gooooal";
        String actual3 = solution.interpret(command3);
        assertEquals(expected3, actual3);

        // Test case 4
        String command4 = "G(al)()()G()()";
        String expected4 = "GalooGoo";
        String actual4 = solution.interpret(command4);
        assertEquals(expected4, actual4);

        // Test case 5
        String command5 = "()G";
        String expected5 = "oG";
        String actual5 = solution.interpret(command5);
        assertEquals(expected5, actual5);

        // Test case 6
        String command6 = "GGG()";
        String expected6 = "GGGo";
        String actual6 = solution.interpret(command6);
        assertEquals(expected6, actual6);

        // Test case 7
        String command7 = "()()()";
        String expected7 = "ooo";
        String actual7 = solution.interpret(command7);
        assertEquals(expected7, actual7);

        // Test case 8
        String command8 = "GG()(al)()";
        String expected8 = "GGoalo";
        String actual8 = solution.interpret(command8);
        assertEquals(expected8, actual8);

        // Test case 9
        String command9 = "G(al)G";
        String expected9 = "GalG";
        String actual9 = solution.interpret(command9);
        assertEquals(expected9, actual9);

        // Test case 10
        String command10 = "GG(al)G()";
        String expected10 = "GGalGo";
        String actual10 = solution.interpret(command10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
