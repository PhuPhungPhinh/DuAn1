/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author xbach
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NhanVien {
    private int Id;
    private String Ma;
    private String Ten;
}
