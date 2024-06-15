package com.example.collectionsjava.u14_genericsindepth.s94_multipletypeparameters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bin<D, W> {
    private D dryTrash;
    private W wetTrash;
}
