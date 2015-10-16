#! /bin/sh
#统计指定路径下指定匹配文件的行数
#找出文件并排序，转成数组
files=($(find $1 -name "$2"|sort))
count=0
for i in "${files[@]}"
do	
	#统计单个文件$i的行数，结果带文件名，如：332 /dir/fileName
	c=$(wc -l $i)echo $c
	#将332 /dir/fileName用' '分隔成数组
	c=($c)
	#取数组的第一个元素332
	c=${c[0]}
	#$(())运算法，累加到count
	#count=$(($count + $c))
	#`expr`运算法，累加到count
	count=`expr $count + $c`
done
echo $count
