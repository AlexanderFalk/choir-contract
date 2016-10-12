package dk.cphbusiness.choir.contract;

import java.util.Collection;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static dk.cphbusiness.choir.contract.ChoirManagerHolder.*;
import static dk.cphbusiness.choir.contract.ChoirManager.*;
//import static java.lang.Math.*;

public class ChoirManagerTest {
  
  @Test
  public void testListMembers() {
    assumeThat(manager, not(nullValue()));
    
    Collection<MemberSummary> members =
        manager.listMembers();
    
    assertThat(members, not(nullValue()));
    }
  
//  public void foo() {
//    double area = cos(PI/6)*sin(PI/6)/2;
//    }
  }
