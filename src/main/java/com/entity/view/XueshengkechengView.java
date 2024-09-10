package com.entity.view;

import com.entity.XueshengkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
@TableName("xueshengkecheng")
public class XueshengkechengView  extends XueshengkechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengkechengView(){
	}
 
 	public XueshengkechengView(XueshengkechengEntity xueshengkechengEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
