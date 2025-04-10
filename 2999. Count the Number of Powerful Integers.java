class Solution {

    public long numberOfPowerfulInt(long rangeStart, long rangeEnd, int chakraLimit, String clanSymbolSuffix) {
        return countPowerfulShinobi(rangeEnd, chakraLimit, clanSymbolSuffix)
             - countPowerfulShinobi(rangeStart - 1, chakraLimit, clanSymbolSuffix);
    }

    private long countPowerfulShinobi(long chakraCap, int chakraLimit, String clanSymbol) {
        String chakraFlow = Long.toString(chakraCap);  // The full chakra path
        int prefixLength = chakraFlow.length() - clanSymbol.length();

        // If the chakra flow is too short to even hold the clan symbol – mission fails
        if (prefixLength < 0) return 0;

        long[][] rasenganScroll = new long[prefixLength + 1][2]; // [i][tightMode]

        // Base case: chakra prefix is complete; now check if the suffix meets the clan symbol
        rasenganScroll[prefixLength][0] = 1; // Not bound to chakraCap
        rasenganScroll[prefixLength][1] = chakraFlow.substring(prefixLength).compareTo(clanSymbol) >= 0 ? 1 : 0;

        // Iterate backward like a careful strategist
        for (int i = prefixLength - 1; i >= 0; i--) {
            int currentChakra = chakraFlow.charAt(i) - '0';

            // If not tight to chakraCap, any digit from 0 to chakraLimit is okay
            rasenganScroll[i][0] = (chakraLimit + 1) * rasenganScroll[i + 1][0];

            // If we're still under chakraCap, be careful
            if (currentChakra <= chakraLimit) {
                rasenganScroll[i][1] = (long) currentChakra * rasenganScroll[i + 1][0] + rasenganScroll[i + 1][1];
            } else {
                rasenganScroll[i][1] = (long) (chakraLimit + 1) * rasenganScroll[i + 1][0];
            }
        }

        return rasenganScroll[0][1];
    }
}
