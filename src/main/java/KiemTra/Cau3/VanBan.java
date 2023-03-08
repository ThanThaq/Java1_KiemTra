package KiemTra.Cau3;


public class VanBan {
    private String st;

    public VanBan() {
    }

    public VanBan(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    // Phương thức: Đếm số từ của văn bản
    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(st);
        long size = 0;
        // Nhận diện khi từ ở vị trí thứ i là khoảng trắng và kí tự thứ i + 1 không phải khoảng trắng
        for(int i = 0; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                size ++;
            }
        }
        return size;
    }

    // Phương thức: Chuẩn hóa 1 xâu theo tiêu chuẩn
    public String chuanHoaVanBan(){
        String text = st.trim().replaceAll("\\s+"," ");
        return text;
    }

    //Phương thức: Chuyển đổi toàn bộ văn bản thành viết hoa
    public String vietHoa(){
        String text =  st.toUpperCase();
        return text;
    }

    //Phương thức: Chuyển đổi toàn bộ văn bản thành viết thường
    public String vietThuong(){
        String text = st.toLowerCase();
        return text;
    }

    //Phương thức: Viết hoa chữ cái đầu tiên
    public String vietHoaMoiTuDauTien(){
        st = vietThuong();
        StringBuffer buffer = new StringBuffer(st);
        buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        for (int i = 1; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                buffer.setCharAt(i+1, Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return st;
    }
}
