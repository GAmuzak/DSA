package Phase1.ArraysAndStrings.Strings;

import java.util.HashSet;

public class LongestNonRepeatingSubString {

    public static int uniqueSubstrings(String input) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;
        while (right < input.length()) {
            char c = input.charAt(right);
            while (set.contains(c)) {
                set.remove(input.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String inp = "qdbaszitlnniyayvgojnmlcjwmpnsrnlcrbkjaycurpzrhswguucjdezcmmddgyjgkjfrjqvymzuscpncfnoidrodcxerbygmmhgfunixdroyhzhraqdeinfxilodxzvgwklmfiozhewvticrxfyenbdesnhipqiufnyayloiizhfyjgaicakmsvfjfibppopovyifqnjexqnefatyxyauzuwfsxvfewgjdalhuqoszpngvrmgrxjmylnvhukkqvvnpzglhmkrnohayufmcdzumoolikxyuzywtbxbjpdgvdxraheoclpllfoxofspnfpuvpsgnaneefinfbwiivfyfqabsxqutqgvjlbjtwgudxhnvklftftvxyyhzybybwozjmrmuhizdtjwtqlwxalmrbawdzaovekiovnucefttmwgjmfzjvwyeeijemwvxpojkhchznbuywkjzlbiflcogqfvfhehvswkdvqsxqtytpxiwrwixadpyknqdopbaknvxsgvimhciwklhwwpajilaothdibsimfkhrqlysymbccbkrurnimqkeadihmqticquxnlqjfxusxscqktafolecwydrmotozevofwtcfuqkfzmmxcsabqjezaizeewxomosgaldtuqqecaxqbhnfejrtdsbpfadnilgwmmyiyiqqtfhczjgmysvtytavvqmrlydlgtyvxcoimdeyajfaxokmkemckzlxdqfcqphqqsuiptryozbuimbjmtlclftnacbeflirspvezwxvbtszhklmwefpbpophgfwzztmkvanlrhdfmafjtmwtiwibdkpbgyfmiervjlxfsyrlmhrpgrsajtqxcmxxkbwozvkoicdxhqfewoxjyfzciangmhdzjnifteqhleopkgzaqkzgbhmeulehsbzjbjqkrujvlpmdqidapwbnhshbfmuzgeabwsscrhjvgggiesfzfgugvfbqelseycxrllixdg";
        int sol = uniqueSubstrings(inp);
        System.out.println(sol);
    }
}