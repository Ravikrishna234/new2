import java.util.*;
class Linr<Key , Value>{

	Key[] keys;
	Value[] values;
	int size;

	public Linr(int x){
		keys = (Key[]) new Object[x];
		values = (Value[]) new Object[x];
		size = x;
	}

	void put(Key k , Value v){
		put(k , v , keys, values);
	}

	void put(Key k , Value v , Key[] key , Value[] value){
		int t = hash(k);
		if(key[t] == null){
			key[t] = k;
			value[t] = v;
		}else if(key[t].equals(k)) value[t] = v;
		else{
			int i = 0;
			for(i = t + 1 ; keys[i] != null ; i = (i + 1) % size);
			key[i] = k;
			value[i] = v;
		}

	}

	int hash(Key k){
		Character c = (Character) k;
		return (11 * (int) c.charValue()) % size;
	}

	Value get(Key k){
		for (int i = 0; i < keys.length ; i++ ) {
			if(keys[i] != null && keys[i].equals(k)) return values[i];
		}
		return null;
	}

	void delete(Key k){
		int i = 0;
		for (i = 0; i < keys.length ; i++ ) {
			if(keys[i] != null && keys[i].equals(k)) break;
		}
		if( i == keys.length) return;
		keys[i] = null;
		values[i] = null;
		Key[] tkeys = (Key[]) new Object[8000];
		Value[] tvalues = (Value[]) new Object[8000];
		for(i = 0 ; i < keys.length ; i++){
			if(keys[i] != null){

				put(keys[i] , values[i], tkeys , tvalues);
			}
		}
		keys = tkeys;
		values = tvalues;
	}

	void resize(int cap ){
		Key[] temp = (Key[]) new Object[cap];
		for(int i = 0 ; i< keys.length ; i++) temp[i] = keys[i];
		keys = temp;
	}

	void display(){
		String str = "{";
		for(int i = 0 ; i < keys.length - 1; i++){
			if(keys[i] != null) str += keys[i]+ ":" + values[i] + ", ";
		}
		if(keys[keys.length - 1] != null) {
            str += keys[keys.length - 1] + ":" + values[keys.length - 1] + "}";
        } else {
            str = str.substring(0,str.length() - 2) + "}";
        }
        System.out.println(str);
	}

}