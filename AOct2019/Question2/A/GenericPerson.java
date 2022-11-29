package PastPapers.AOct2019.Question2.A;

import java.util.List;

public class GenericPerson <T extends IPerson>{
    public void displayElements(List<? extends IPerson> list){
        for (IPerson item: list){
            item.displayDetails();
        }
    }
}
