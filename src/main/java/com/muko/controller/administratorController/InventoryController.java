package com.muko.controller.administratorController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ description:
 */
@Controller
@RequestMapping("/administrator/inv_info_manage")
public class InventoryController {
    InventoryController() {
    }

    @RequestMapping("/main")
    public String toMain(){
        return "administrator/inventory_management";
    }

}
