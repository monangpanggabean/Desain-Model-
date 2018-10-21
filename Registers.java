/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 32 "model.ump"
// line 129 "model.ump"
public class Registers
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Registers Associations
  private List<MemoryAccess> memoryAccesses;
  private List<HardWareAccess> hardWareAccesses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Registers()
  {
    memoryAccesses = new ArrayList<MemoryAccess>();
    hardWareAccesses = new ArrayList<HardWareAccess>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public MemoryAccess getMemoryAccess(int index)
  {
    MemoryAccess aMemoryAccess = memoryAccesses.get(index);
    return aMemoryAccess;
  }

  public List<MemoryAccess> getMemoryAccesses()
  {
    List<MemoryAccess> newMemoryAccesses = Collections.unmodifiableList(memoryAccesses);
    return newMemoryAccesses;
  }

  public int numberOfMemoryAccesses()
  {
    int number = memoryAccesses.size();
    return number;
  }

  public boolean hasMemoryAccesses()
  {
    boolean has = memoryAccesses.size() > 0;
    return has;
  }

  public int indexOfMemoryAccess(MemoryAccess aMemoryAccess)
  {
    int index = memoryAccesses.indexOf(aMemoryAccess);
    return index;
  }
  /* Code from template association_GetMany */
  public HardWareAccess getHardWareAccess(int index)
  {
    HardWareAccess aHardWareAccess = hardWareAccesses.get(index);
    return aHardWareAccess;
  }

  public List<HardWareAccess> getHardWareAccesses()
  {
    List<HardWareAccess> newHardWareAccesses = Collections.unmodifiableList(hardWareAccesses);
    return newHardWareAccesses;
  }

  public int numberOfHardWareAccesses()
  {
    int number = hardWareAccesses.size();
    return number;
  }

  public boolean hasHardWareAccesses()
  {
    boolean has = hardWareAccesses.size() > 0;
    return has;
  }

  public int indexOfHardWareAccess(HardWareAccess aHardWareAccess)
  {
    int index = hardWareAccesses.indexOf(aHardWareAccess);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMemoryAccesses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMemoryAccess(MemoryAccess aMemoryAccess)
  {
    boolean wasAdded = false;
    if (memoryAccesses.contains(aMemoryAccess)) { return false; }
    memoryAccesses.add(aMemoryAccess);
    if (aMemoryAccess.indexOfRegister(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMemoryAccess.addRegister(this);
      if (!wasAdded)
      {
        memoryAccesses.remove(aMemoryAccess);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMemoryAccess(MemoryAccess aMemoryAccess)
  {
    boolean wasRemoved = false;
    if (!memoryAccesses.contains(aMemoryAccess))
    {
      return wasRemoved;
    }

    int oldIndex = memoryAccesses.indexOf(aMemoryAccess);
    memoryAccesses.remove(oldIndex);
    if (aMemoryAccess.indexOfRegister(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMemoryAccess.removeRegister(this);
      if (!wasRemoved)
      {
        memoryAccesses.add(oldIndex,aMemoryAccess);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMemoryAccessAt(MemoryAccess aMemoryAccess, int index)
  {  
    boolean wasAdded = false;
    if(addMemoryAccess(aMemoryAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMemoryAccesses()) { index = numberOfMemoryAccesses() - 1; }
      memoryAccesses.remove(aMemoryAccess);
      memoryAccesses.add(index, aMemoryAccess);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMemoryAccessAt(MemoryAccess aMemoryAccess, int index)
  {
    boolean wasAdded = false;
    if(memoryAccesses.contains(aMemoryAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMemoryAccesses()) { index = numberOfMemoryAccesses() - 1; }
      memoryAccesses.remove(aMemoryAccess);
      memoryAccesses.add(index, aMemoryAccess);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMemoryAccessAt(aMemoryAccess, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHardWareAccesses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addHardWareAccess(HardWareAccess aHardWareAccess)
  {
    boolean wasAdded = false;
    if (hardWareAccesses.contains(aHardWareAccess)) { return false; }
    hardWareAccesses.add(aHardWareAccess);
    if (aHardWareAccess.indexOfRegister(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aHardWareAccess.addRegister(this);
      if (!wasAdded)
      {
        hardWareAccesses.remove(aHardWareAccess);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeHardWareAccess(HardWareAccess aHardWareAccess)
  {
    boolean wasRemoved = false;
    if (!hardWareAccesses.contains(aHardWareAccess))
    {
      return wasRemoved;
    }

    int oldIndex = hardWareAccesses.indexOf(aHardWareAccess);
    hardWareAccesses.remove(oldIndex);
    if (aHardWareAccess.indexOfRegister(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aHardWareAccess.removeRegister(this);
      if (!wasRemoved)
      {
        hardWareAccesses.add(oldIndex,aHardWareAccess);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHardWareAccessAt(HardWareAccess aHardWareAccess, int index)
  {  
    boolean wasAdded = false;
    if(addHardWareAccess(aHardWareAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHardWareAccesses()) { index = numberOfHardWareAccesses() - 1; }
      hardWareAccesses.remove(aHardWareAccess);
      hardWareAccesses.add(index, aHardWareAccess);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHardWareAccessAt(HardWareAccess aHardWareAccess, int index)
  {
    boolean wasAdded = false;
    if(hardWareAccesses.contains(aHardWareAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHardWareAccesses()) { index = numberOfHardWareAccesses() - 1; }
      hardWareAccesses.remove(aHardWareAccess);
      hardWareAccesses.add(index, aHardWareAccess);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHardWareAccessAt(aHardWareAccess, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<MemoryAccess> copyOfMemoryAccesses = new ArrayList<MemoryAccess>(memoryAccesses);
    memoryAccesses.clear();
    for(MemoryAccess aMemoryAccess : copyOfMemoryAccesses)
    {
      aMemoryAccess.removeRegister(this);
    }
    ArrayList<HardWareAccess> copyOfHardWareAccesses = new ArrayList<HardWareAccess>(hardWareAccesses);
    hardWareAccesses.clear();
    for(HardWareAccess aHardWareAccess : copyOfHardWareAccesses)
    {
      aHardWareAccess.removeRegister(this);
    }
  }

}