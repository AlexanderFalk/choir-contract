package dk.cphbusiness.choir.contract;

import java.util.Collection;

/**
 * Description.
 */
public interface ChoirManager {
  
  /**
   * List all members.
   * 
   * @return a list of member summaries 
   */
  Collection<MemberSummary> listMembers();
  
  /**
   * Find a member by identifier.
   * 
   * @param id the member identifier
   * @return A collection of member  summaries
   */
  MemberDetail findMember(MemberIdentifier id);
  
  /**
   * Save a members details
   * 
   * @pre
   * 
   * @param member the member details 
   * 
   * @post
   * 
   */
  void saveMember(MemberDetail member);

  /**
   * Member identifier
   */
  public static class MemberIdentifier {
    private final long id;

    public MemberIdentifier(long id) {
      this.id = id;
      }

    public long getId() {
      return id;
      }
    
    }

  /**
   * Member details
   */
  public static class MemberDetail extends MemberIdentifier {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    
    public MemberDetail(
        long id, 
        String firstName,
        String lastName,
        String phone,
        String email) { 
      super(id); 
      this.firstName = firstName;
      this.lastName = lastName;
      this.phone = phone;
      this.email = email;
      }

    public String getFirstName() { return firstName; }

    public void setFirstName(String value) { firstName = value; }

    public String getLastName() { return lastName; }

    public void setLastName(String value) { lastName = value; }

    public String getPhone() { return phone; }

    public void setPhone(String value) { phone = value; }

    public String getEmail() { return email; }

    public void setEmail(String value) { email = value; }
    
    }

  /**
   * Member summary
   */
  public static class MemberSummary extends MemberIdentifier {
    private final String firstName;
    private final String lastName;
    private final String voiceName;

    public MemberSummary(long id, String firstName, String lastName, String voiceName) {
      super(id);
      this.firstName = firstName;
      this.lastName = lastName;
      this.voiceName = voiceName;
      }

    public String getFirstName() {
      return firstName;
      }

    public String getLastName() {
      return lastName;
      }

    public String getVoiceName() {
      return voiceName;
      }
    
    }
  
  }
