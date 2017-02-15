//重写equals方法
public boolean equals (Object obj) {
	/*if (this.name.equals(obj.name) && this.age == obj.age) {
		return true;
	}
	return false;*/
	if (this == obj)
		return true;
	if (!(obj instanceof Student))
		return false;

	return this.name.equals(obj.name) && this.age == obj.age;
}