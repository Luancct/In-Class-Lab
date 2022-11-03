/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

/**
 *
 * @author My PC
 */
public class Car {
    private final string _makeModel;
    private final int _month;
    private final int _make;

    public Car(string makeModel, int month, int make)
    {
      _makeModel = makeModel;
      _month = month;
      _make = make;
    }

    public string GetMakeModel()
    {
      return _makeModel;
    }

    public boolean WorthBuying(int numberOfDays)
    {
      return _month <= numberOfDays;
    }
}
public enum Make