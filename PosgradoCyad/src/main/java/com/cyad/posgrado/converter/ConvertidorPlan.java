package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EPlan;
import com.cyad.posgrado.model.MPlan;

@Component("convertidor_planes")
public class ConvertidorPlan {
	public List<MPlan> convertirLista(List<EPlan> eplanes){
		List<MPlan> mplanes = new ArrayList<>();
		for(EPlan plan : eplanes) {
			mplanes.add(new MPlan(plan));
		}
		return mplanes;
	}
}
