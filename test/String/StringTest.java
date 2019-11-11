package String;

import main.String.GroupAnagram;
import main.String.NumOfUniqueEmails;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {

    @Test
    void numOfUniqueEmails() {
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int result = NumOfUniqueEmails.numOfUniqueEmails(emails);
        assertEquals(1, result);
    }

    @Test
    void listGroupAnagram() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("eat");
        first.add("tea");
        first.add("ate");

        List<String> second = new ArrayList<String>();
        second.add("bat");

        List<String> third = new ArrayList<String>();
        third.add("tan");
        third.add("nat");

        expected.add(first);
        expected.add(second);
        expected.add(third);

        List<List<String>> result = new ArrayList<List<String>>();

        result = GroupAnagram.listGroupAnagram(strs);
        assertEquals(result, expected);
    }

    @Test
    void groupOfAnagramsAnotherSolution() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<List<String>>();

        List<String> first = new ArrayList<String>();

        first.add("tan");
        first.add("nat");

        List<String> second = new ArrayList<String>();
        second.add("eat");
        second.add("tea");
        second.add("ate");

        List<String> third = new ArrayList<String>();
        third.add("bat");

        expected.add(first);
        expected.add(second);
        expected.add(third);

        List<List<String>> result = new ArrayList<List<String>>();

        result = GroupAnagram.groupOfAnagrams(strs);
        assertEquals(expected, result);
    }

    @Test
    void maximumOccurringCharacter() {
        String strs = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        char result = GroupAnagram.maximumOccurringCharacter(strs);

        assertEquals('a', result);
    }



}