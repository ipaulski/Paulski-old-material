using System;
using System.Collections.Generic;

namespace SearchGenerator.Data
{
    public partial class CpcertifiedTestersList
    {
        public string Last { get; set; } = null!;
        public string First { get; set; } = null!;
        public string Id { get; set; } = null!;
        public string? Company { get; set; }
        public string? Address1 { get; set; }
        public string? City { get; set; }
        public string? St { get; set; }
        public string? Zip { get; set; }
        public string? Phone { get; set; }
        public string? Fax { get; set; }
        public string? EMail { get; set; }
        public DateTime? OriginalCertificationDate { get; set; }
        public DateTime? LicenseExpires { get; set; }
        public string? CcEMail { get; set; }
    }
}
