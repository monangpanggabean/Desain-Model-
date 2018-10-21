/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 87 "model.ump"
// line 195 "model.ump"
public class End
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //End Associations
  private List<SysCallReader> sysCallReaders;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public End()
  {
    sysCallReaders = new ArrayList<SysCallReader>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public SysCallReader getSysCallReader(int index)
  {
    SysCallReader aSysCallReader = sysCallReaders.get(index);
    return aSysCallReader;
  }

  public List<SysCallReader> getSysCallReaders()
  {
    List<SysCallReader> newSysCallReaders = Collections.unmodifiableList(sysCallReaders);
    return newSysCallReaders;
  }

  public int numberOfSysCallReaders()
  {
    int number = sysCallReaders.size();
    return number;
  }

  public boolean hasSysCallReaders()
  {
    boolean has = sysCallReaders.size() > 0;
    return has;
  }

  public int indexOfSysCallReader(SysCallReader aSysCallReader)
  {
    int index = sysCallReaders.indexOf(aSysCallReader);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSysCallReaders()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSysCallReader(SysCallReader aSysCallReader)
  {
    boolean wasAdded = false;
    if (sysCallReaders.contains(aSysCallReader)) { return false; }
    sysCallReaders.add(aSysCallReader);
    if (aSysCallReader.indexOfEnd(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSysCallReader.addEnd(this);
      if (!wasAdded)
      {
        sysCallReaders.remove(aSysCallReader);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSysCallReader(SysCallReader aSysCallReader)
  {
    boolean wasRemoved = false;
    if (!sysCallReaders.contains(aSysCallReader))
    {
      return wasRemoved;
    }

    int oldIndex = sysCallReaders.indexOf(aSysCallReader);
    sysCallReaders.remove(oldIndex);
    if (aSysCallReader.indexOfEnd(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSysCallReader.removeEnd(this);
      if (!wasRemoved)
      {
        sysCallReaders.add(oldIndex,aSysCallReader);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSysCallReaderAt(SysCallReader aSysCallReader, int index)
  {  
    boolean wasAdded = false;
    if(addSysCallReader(aSysCallReader))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSysCallReaders()) { index = numberOfSysCallReaders() - 1; }
      sysCallReaders.remove(aSysCallReader);
      sysCallReaders.add(index, aSysCallReader);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSysCallReaderAt(SysCallReader aSysCallReader, int index)
  {
    boolean wasAdded = false;
    if(sysCallReaders.contains(aSysCallReader))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSysCallReaders()) { index = numberOfSysCallReaders() - 1; }
      sysCallReaders.remove(aSysCallReader);
      sysCallReaders.add(index, aSysCallReader);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSysCallReaderAt(aSysCallReader, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<SysCallReader> copyOfSysCallReaders = new ArrayList<SysCallReader>(sysCallReaders);
    sysCallReaders.clear();
    for(SysCallReader aSysCallReader : copyOfSysCallReaders)
    {
      aSysCallReader.removeEnd(this);
    }
  }

}