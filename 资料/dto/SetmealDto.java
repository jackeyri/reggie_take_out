package com.togogo.reggie.dto;

import com.togogo.reggie.entity.Setmeal;
import com.togogo.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
