

public  int gcd(int i,int j){
	if(j==0)return i;
	int temp=i%j;
	i=j;
	return gcd(j,temp);

}


