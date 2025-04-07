import { Route, Routes } from "react-router";
import AdminDashboard from "./AdminDashboard";
import OrdersAdmin from "./order/OrdersAdmin";
import ProductManagement from "./product/ProductManagement";
import ProductAdmin from "./product/ProductAdmin";
import OrderDetailsAdmin from "./order/OrderDetailsAdmin";
import CustomersAdmin from "./customer/CustomersAdmin";
import NotificationsAdmin from "./notification/NotificationsAdmin";
import AdminSidebar from "../../../layouts/Sidebar/AdminSidebar";
import UserHeader from "../../../layouts/UserHeader";

export default function AdminPage() {
  return (
    <>
      <AdminSidebar />
      <main className="window-main">
        <UserHeader/>
        <div className="window-main-body h-100">
          <Routes>
            <Route path="*" element={<AdminDashboard />} />
            <Route path="/orders" element={<OrdersAdmin />} />
            <Route path="/order" element={<OrderDetailsAdmin />} />
            <Route path="/products" element={<ProductManagement />} />
            <Route path="/product" element={<ProductAdmin />} />
            <Route path="/customers" element={<CustomersAdmin />} />
            <Route path="/notifications" element={<NotificationsAdmin />} />
          </Routes>
        </div>
      </main>
    
    </>
  );
}
