bool isAnagram(char* s, char* t)
{
    int s1 = strlen(s);
    int t1 = strlen(t);
    if (s1!= t1) 
        return false;
    int freq[123] = {0};
    for (int i = 0; i < s1; i++)
     {
        freq[s[i]]++;
        freq[t[i]]--;
    }
    for (int i = 0; i < 123; i++) {
        if (freq[i] != 0) 
            return false;
    }
    return true;
}