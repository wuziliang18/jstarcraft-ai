package com.jstarcraft.ai.data;

/**
 * 数据实例
 * 
 * @author Birdy
 *
 */
public interface DataInstance {

	/**
	 * 设置游标
	 * 
	 * @param cursor
	 */
	void setCursor(int cursor);

	/**
	 * 获取游标
	 * 
	 * @return
	 */
	int getCursor();

	/**
	 * 获取指定索引的离散特征
	 * 
	 * @param index
	 * @return
	 */
	int getDiscreteFeature(int index);

	/**
	 * 获取指定索引的连续特征
	 * 
	 * @param index
	 * @return
	 */
	float getContinuousFeature(int index);

	/**
	 * 遍历离散特征
	 * 
	 * @param accessor
	 * @return
	 */
	DataInstance iterateDiscreteFeatures(DiscreteAccessor accessor);

	/**
	 * 遍历连续特征
	 * 
	 * @param accessor
	 * @return
	 */
	DataInstance iterateContinuousFeatures(ContinuousAccessor accessor);

}
